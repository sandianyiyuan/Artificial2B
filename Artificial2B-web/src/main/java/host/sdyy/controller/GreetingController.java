package host.sdyy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import host.sdyy.GetUserInfoService;


/**
 * @author paida 派哒 zeyu.pzy@alibaba-inc.com
 */
@Controller
public class GreetingController {

	@Autowired
	private GetUserInfoService getUserInfoService;

	@GetMapping("/greeting3")
	public void greeting(@RequestParam(name="name", required=false, defaultValue="1") String name, Model model) {
		// 方法返回值为void 使用请求路径同名的模板
		getUserInfoService.getUserInfoById(name, model);
		//这里返回的数据类型是String，但实际上更多的数据通过本函数中Model model传给了前端。返回值String也会被SpringMVC整合为一个ModelAndView，以供前端使用。
		//（Controller可以返回多种数值，比如void、String、ModelAndView。同学们可以自行搜索学习）
		//return "userform";		//这里指定返回的模板文件，如果没写则默认为请求路径同名的模板
	}

	@GetMapping("/greeting4")
	public String greetinguserform(@RequestParam(name="name", required=false, defaultValue="1") String name, Model model) {
		// 请求路径与返回String不同，使用retun String的模板
		getUserInfoService.getUserInfoById(name, model);
		// 这里返回的数据类型是String，但实际上更多的数据通过本函数中Model model传给了前端。
		// 返回值String也会被SpringMVC整合为一个ModelAndView，以供前端使用。
		return "userform";		//这里指定返回的模板文件，如果没写则默认为请求路径同名的模板
	}

	@GetMapping("/subDitTemplates")
	public String subDitTemplates(@RequestParam(name="name", required=false, defaultValue="1") String name, Model model) {
		// 请求路径与返回String不同，使用retun String的模板
		getUserInfoService.getUserInfoById(name, model);
		// 这里返回的数据类型是String，但实际上更多的数据通过本函数中Model model传给了前端。
		// 返回值String也会被SpringMVC整合为一个ModelAndView，以供前端使用。
		return "./subdir/subDitTemplates";		//这里指定返回的模板文件，如果没写则默认为请求路径同名的模板,子目录需要指定路径
	}
}
