package filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
    /**
     * 自定义httpFilter类，实现filter接口
     * @author junlin
     *
     */
    public abstract class HttpFilter implements Filter {

        @Override
        public void destroy() {
        }
        /**
         * 原生的doFilter方法，在方法内部把ServletRequest req, ServletResponse resp
         * 转换为HttpServletRequest，HttpServletResponse并调用了
         * doFilter(HttpServletRequest request,HttpServletResponse response, FilterChain chain)
         *
         * 若编写filter的过滤方法不建议直接继承该方法，而建议继承
         * doFilter(HttpServletRequest request,HttpServletResponse response, FilterChain filterChain)
         */
        @Override
        public void doFilter(ServletRequest req, ServletResponse resp,
                             FilterChain chain) throws IOException, ServletException {
            HttpServletRequest request = (HttpServletRequest) req;
            HttpServletResponse response = (HttpServletResponse) resp;

            doFilter(request, response, chain);
        }
        /**
         * 抽象方法，为http请求定制，必须实现的方法
         * @param request
         * @param response
         * @param filterChain
         * @throws IOException
         * @throws ServletException
         */
        public abstract void doFilter(HttpServletRequest request,
                                      HttpServletResponse response, FilterChain filterChain)
                throws IOException, ServletException;

        /**
         * 用于保存filterConfig对象
         */
        private FilterConfig filterConfig;

        /**
         * 不建议子类直接覆盖，若覆盖，将可能会导致filterconfig成员变量初始化失败
         */
        @Override
        public void init(FilterConfig filterConfig) throws ServletException {
            this.filterConfig=filterConfig;
            //出使化变量
            init();
        }
        /**
         * 供子类继承的出使化方法，可以通过getFilterConfig()获取filterConfig;
         */
        protected void init() {
        }
        public FilterConfig getFilterConfig() {
            return filterConfig;
        }

}
