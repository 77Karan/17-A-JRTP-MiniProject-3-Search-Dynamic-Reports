package in.ashokit.service;

import java.util.List;

import in.ashokit.binding.PlanResponse;
import in.ashokit.binding.SearchRequest;

public interface InsurancePlanService
{
	public List<PlanResponse> searchPlan(SearchRequest req); 
	
	public List<String> getUniquePlanNames();
	
	public List<String> getUniquePlanStatus();

	
	

}
