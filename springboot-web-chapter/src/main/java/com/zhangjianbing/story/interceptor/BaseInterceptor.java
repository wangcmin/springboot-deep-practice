package com.zhangjianbing.story.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhangjianbing
 * time 2019/5/15
 */
@Slf4j
@Component
public class BaseInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }

//    private static final String GAIA_API_HEADER = "X-Gaia-Api-Key";
//
//    @Value("${iam.cas.server.gaia-api-key}")
//    private String casGaiaApiKey;
//
//    @Value("${iam.cas.server.url}")
//    private String casServerUrl;
//
//    @Override
//    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) {
//        String token = httpServletRequest.getParameter("token");
//        log.info("传入的token：" + token);
//        if (StringUtils.isNotBlank(token)) {
//            try {
//                UserInfoResultDto result = getUserInfoResultByToken(token);
//                if (TokenConstant.SUCCESS.equals(result.getCode())) {
//                    log.info("BaseInterceptor --- preHandle --- token验证通过");
//                    return true;
//                } else if (TokenConstant.EXPIRED_ACCESSTOKEN.equals(result.getCode())) {
//                    log.info("BaseInterceptor --- preHandle --- token超时");
//                    RestResponseBo bo = RestResponseBo.fail("token超时");
//                    httpServletResponse.getWriter().write(JSONUtil.toJsonStr(bo));
//                    return false;
//                } else if (TokenConstant.MISSING_ACCESSTOKEN.equals(result.getCode())) {
//                    log.info("BaseInterceptor --- preHandle --- token为空");
//                    RestResponseBo bo = RestResponseBo.fail("token为空");
//                    httpServletResponse.getWriter().write(JSONUtil.toJsonStr(bo));
//                    return false;
//                } else {
//                    return false;
//                }
//            } catch (Exception e) {
//                log.error("BaseInterceptor --- preHandle --- cas内部错误");
//                return false;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
//        // 此方法在请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
//        // 此方法在整个请求结束之后被调用，也就是在 DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
//    }
//
//    /**
//     * 验证token有效性
//     *
//     * @param token
//     * @return
//     * @throws Exception
//     */
//    public UserInfoResultDto getUserInfoResultByToken(String token) {
//        String url = casServerUrl + "/cas/v1/user/getByToken";
//        log.info("根据token查询用户简要信息url = " + url);
//        Map<String, Object> param = new HashMap<>();
//        param.put("access_token", token);
//        Map<String, Object> headers = new HashMap<>();
//        headers.put(GAIA_API_HEADER, casGaiaApiKey);
//        String body = HttpUtil.post(url, param, headers);
//        UserInfoResultDto resultDto = JSONUtil.toBean(body, UserInfoResultDto.class);
//        return resultDto;
//    }
}
