package shop.payover.manage.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import shop.payover.manage.security.service.ManagerDetailsService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	/**
	 * 登录session key
	 */
	public final static String SESSION_KEY = "manager_login_user_key";

	@Autowired
	private ManagerDetailsService userDetailsService;

	@Autowired
	SessionRegistry sessionRegistry;

//	@Autowired
//	private AuthenticationProvider securityProvider;

	@Override
	protected UserDetailsService userDetailsService() {
		// 自定义用户信息类
		return this.userDetailsService;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/", "/index.html").permitAll()
				.anyRequest().authenticated() // 任何请求,登录后可以访问
				.and().formLogin().loginPage("/login").loginProcessingUrl("/login").usernameParameter("username").passwordParameter("password")
				.defaultSuccessUrl("/main.html")
				// 成功处理
				.successHandler(new AuthenticationSuccessHandler() {
					@Override
					public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
							Authentication authentication) throws IOException, ServletException {
						Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
						if (principal != null && principal instanceof UserDetails) {
							UserDetails user = (UserDetails) principal;
							System.out.println("loginUser:" + user.getUsername());
							// 维护在session中
							request.getSession().setAttribute("userDetail", user);
							response.sendRedirect("/");
						}
					}
				})
				// 失败处理
				.failureHandler(new AuthenticationFailureHandler() {

					@Override
					public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
							AuthenticationException exception) throws IOException, ServletException {
						System.out.println("error" + exception.getMessage());
						response.sendRedirect("/login");
					}
				}).permitAll() // 登录页面用户任意访问
				.failureUrl("/login?error").loginProcessingUrl("/main.html").and().sessionManagement().maximumSessions(1)
				.sessionRegistry(sessionRegistry).and().and().logout().permitAll() // 注销行为任意访问
				.and().httpBasic();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/js/**", "/css/**", "/images/**", "/**/favicon.ico", "/plugins/**", "/datas/**");
		// 防止拦截css,js，image文件
	}

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		 auth.userDetailsService(userDetailsService).passwordEncoder(new PasswordEncoder() {
//			
//			 @Override
//			 public String encode(CharSequence rawPassword) {
//				 return (String)rawPassword;//MD5Util.encode((String) rawPassword);
//			 }
//			
//			 @Override
//			 public boolean matches(CharSequence rawPassword, String
//			 encodedPassword) {
//				 System.out.println(encodedPassword + "---" + (String)rawPassword);
//				 return encodedPassword.equals((String) rawPassword);
//			 }
//		 });
//		// 登录验证，绑定自定义的UserDetailServiceHolder
//
////		auth.authenticationProvider(securityProvider);
//	}

	 @Autowired
	 public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		 auth.userDetailsService(userDetailsService).passwordEncoder(new PasswordEncoder() {
				
			 @Override
			 public String encode(CharSequence rawPassword) {
				 return (String)rawPassword;//MD5Util.encode((String) rawPassword);
			 }
			
			 @Override
			 public boolean matches(CharSequence rawPassword, String
			 encodedPassword) {
				 System.out.println(encodedPassword + "---" + (String)rawPassword);
				 return encodedPassword.equals((String) rawPassword);
			 }
		 });
		 //这里是新增一个默认用户
		 auth.inMemoryAuthentication().withUser("admin").password("123456").roles("ADMIN");
	 }

	@Bean
	public SessionRegistry getSessionRegistry() {
		SessionRegistry sessionRegistry = new SessionRegistryImpl();
		return sessionRegistry;
	}

}
