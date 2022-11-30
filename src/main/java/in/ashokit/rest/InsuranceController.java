package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.PlanResponse;
import in.ashokit.binding.SearchRequest;
import in.ashokit.service.InsurancePlanService;

@RestController
public class InsuranceController 
{
	@Autowired
	private InsurancePlanService service;
	
	@PostMapping("/plans")
	public ResponseEntity<List<PlanResponse>> getPlans(@RequestBody SearchRequest req)
	{
		List<PlanResponse> searchPlans=service.searchPlan(req);
		return new ResponseEntity<List<PlanResponse>>(searchPlans,HttpStatus.OK);
	}
	
	@GetMapping("/getPlanNames")
	public ResponseEntity<List<String>> getPlanNames()
	{
		List<String> uniquePlans = service.getUniquePlanNames();
		return new ResponseEntity<List<String>>(uniquePlans,HttpStatus.OK);
	}
	
	@GetMapping("/getPlanStatus")
	public ResponseEntity<List<String>> getPlanStatus()
	{
		List<String> uniquePlanStatus = service.getUniquePlanStatus();
		return new ResponseEntity<List<String>>(uniquePlanStatus,HttpStatus.OK);
	}

}
