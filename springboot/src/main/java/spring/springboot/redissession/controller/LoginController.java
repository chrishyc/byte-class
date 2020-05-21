package spring.springboot.redissession.controller;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.springboot.pojo.ValidPojo;

import javax.servlet.http.HttpSession;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Valid;
import javax.validation.Constraint;
import org.springframework.web.method.annotation.*;
import org.hibernate.validator.internal.metadata.descriptor.*;
import org.hibernate.validator.internal.constraintvalidators.bv.number.bound.*;
import org.hibernate.validator.internal.engine.*;
@Controller
@RequestMapping("login")
public class LoginController {
    
    /**
     * {@link Valid}注解类生成中心,{@link org.hibernate.validator.internal.metadata.core.ConstraintHelper#ConstraintHelper()}
     * {@link Constraint}:Marks an annotation as being a Bean Validation constraint, A given constraint annotation must be annotated
     *
     * 主要逻辑
     * {@link ModelAttributeMethodProcessor#resolveArgument}
     * 绑定{@link ModelAttributeMethodProcessor#bindRequestParameters}
     * 校验{@link ModelAttributeMethodProcessor#validateIfApplicable}
     * 抛异常{@link ModelAttributeMethodProcessor#isBindExceptionRequired(MethodParameter)}
     *
     * 校验
     * {@link ConstraintDescriptorImpl#parseComposingConstraints}
     * {@link AbstractMaxValidator#isValid(Object, ConstraintValidatorContext)}
     * {@link ValidationContext#addConstraintFailures}
     *
     * 抛异常
     * {@link }
     * @param user
     * @return
     */
    @RequestMapping("toLogin")
    public String toLogin(@Valid ValidPojo user) {
        System.out.println("================++++++++++++++跳转登录页面");
        return "login";
    }
    
    @RequestMapping("loginSystem")
    public String loginSystem(String username, String password, HttpSession session) {
        // 合法用户，信息写入session，同时跳转到系统主页面
        if ("admin".equals(username) && "admin".equals(password)) {
            System.out.println("合法用户");
            session.setAttribute("username", username + System.currentTimeMillis());
            return "redirect:/demo/result";
        } else {
            // 非法用户返回登录页面
            System.out.println("非法，跳转");
            return "redirect:/login/toLogin";
        }
    }
}
