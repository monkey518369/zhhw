package cn.nfschina.zhhw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.nfschina.zhhw.model.DriverInfo;
import cn.nfschina.zhhw.service.DriverService;

/**
 * @ClassName: CarDispatchController
 * @Description: 车辆远程调度控制器
 * @company: nfschina
 * @date 2015年9月22日 上午9:02:56
 * @author wcy
 */
@RequestMapping(value = "/cardispatch")
@Controller
public class CarDispatchController {
	
	@Resource
	private DriverService driverService;
	
	@RequestMapping(value = "/getAllDriverPhone")
	@ResponseBody
	private List<DriverInfo> getAllDriverPhone(){
		return driverService.getAllDriver();
	}
	
	@RequestMapping(value = "/dispatch")
	@ResponseBody
	private void carDispatch(String ids,String textMessage,String message,String ConversationType,String phoneNum){
		System.out.println(ids);
	}
}
