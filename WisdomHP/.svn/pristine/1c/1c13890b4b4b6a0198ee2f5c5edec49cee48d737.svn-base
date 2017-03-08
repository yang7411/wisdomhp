package com.audaque.sunt.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.audaque.sunt.bean.EventClassNewModel;
import com.audaque.sunt.bean.EventRequestBlobModel;
import com.audaque.sunt.bean.EventRequestModel;
import com.audaque.sunt.mapper.EventClassNewMapper;
import com.audaque.sunt.mapper.EventRequestBlobMapper;
import com.audaque.sunt.mapper.EventRequestMapper;
import com.audaque.sunt.utils.ResultMsg;
import com.audaque.sunt.utils.ResultStatusCode;
import com.mysql.jdbc.StringUtils;

@RestController
@RequestMapping("event")
public class EventController {
	
	@Autowired
	private EventClassNewMapper eventClassNewMapper;
	
	@Autowired
	private EventRequestMapper eventRequestMapper;
	
	@Autowired
	private EventRequestBlobMapper eventRequestBlobMapper;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@RequestMapping(value = "/getEventClassAll", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Object getEventClass()
	{
		List<EventClassNewModel> eventList = null;
		ResultMsg<Object> resultMsg = null;
		try{
			eventList = eventClassNewMapper.getEventClassAll();
		}catch(Exception e){
			e.printStackTrace();
			return new ResultMsg<Object>(false,ResultStatusCode.SYSTEM_ERR.getCode(), ResultStatusCode.SYSTEM_ERR.getMsg(),e.getMessage());
		}
        resultMsg = new ResultMsg<Object>(true,ResultStatusCode.OK.getCode(), ResultStatusCode.OK.getMsg(),eventList);
		return resultMsg;
	}
	
	@RequestMapping(value = "/getEventClass/{pid}", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public Object getEventClass(@PathVariable("pid") String pid)
	{
		List<EventClassNewModel> eventList = null;
		ResultMsg<Object> resultMsg = null;
		try{
			eventList = eventClassNewMapper.getEventClass(pid);
		}catch(Exception e){
			e.printStackTrace();
			return new ResultMsg<Object>(false,ResultStatusCode.SYSTEM_ERR.getCode(), ResultStatusCode.SYSTEM_ERR.getMsg(),e.getMessage());
		}
        resultMsg = new ResultMsg<Object>(true,ResultStatusCode.OK.getCode(), ResultStatusCode.OK.getMsg(),eventList);
		return resultMsg;
	}
	
	
	@RequestMapping(value = "add", method = {RequestMethod.POST })
	@ResponseBody
	public Object add(@RequestBody EventRequestModel eventRequestModel)
	{
		ResultMsg<Object> resultMsg = null;
		synchronized (this) {
			try{
				if(eventRequestModel != null && !StringUtils.isNullOrEmpty(eventRequestModel.getTelnumber())
						&& !StringUtils.isNullOrEmpty(eventRequestModel.getEventdescription())
						&& !StringUtils.isNullOrEmpty(eventRequestModel.getClassidx())){
					eventRequestModel.setAcceptdatetime(sdf.format(new Date()));
					Random random = new Random();
					int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数
					long eventClassId = Long.parseLong(System.currentTimeMillis()+""+rannum);
					eventRequestModel.setId(eventClassId);
					eventRequestMapper.save(eventRequestModel);
					if(eventRequestModel.getPictureList() != null && eventRequestModel.getPictureList().size()>0){
					    for(EventRequestBlobModel blob:eventRequestModel.getPictureList()){
				            byte[] bytes = Base64.decodeBase64(blob.getMultimedia());
//							FileUtils.writeByteArrayToFile(new File("D:\\jiaFiles"+File.separator+"auth.jpg"), bytes);
					    	eventRequestBlobMapper.save(eventRequestModel.getId(),bytes,blob.getFilename());
					    }
					}
					resultMsg = new ResultMsg<Object>(true,ResultStatusCode.OK.getCode(), ResultStatusCode.OK.getMsg(),eventRequestModel);
				}else{
					resultMsg = new ResultMsg<Object>(false,ResultStatusCode.PARAM_NOT_NULL.getCode(), ResultStatusCode.PARAM_NOT_NULL.getMsg(),eventRequestModel);
				}
			}catch(Exception e){
				e.printStackTrace();
				return new ResultMsg<Object>(false,ResultStatusCode.SYSTEM_ERR.getCode(), ResultStatusCode.SYSTEM_ERR.getMsg(),e.getMessage());
			}
		}
		return resultMsg;
	}
		
}
