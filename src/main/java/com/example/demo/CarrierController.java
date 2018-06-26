package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    
@RequestMapping(path="/carrier")
public class CarrierController {
	
	@Autowired
	private CarrierRepository carrierRepository;
//	@RequestMapping(value = "/carriers/{carrierId}/markets", method = RequestMethod.GET)
	@GetMapping(path="/carriers")
	public @ResponseBody Iterable<Carrier> getCarriers(){	
		Iterable<Carrier> c = carrierRepository.findAll();
		return c;
	}
	
	
	
	/*@GetMapping(path="/carriers")
	public @ResponseBody Iterable<User> getMarketsByCarrierId(@PathVariable String carrierId) throws InvalidCarrierIdException, Exception{	
		
		logger.debug("carrierId: " + carrierId);
		
		if(StringUtils.isBlank(carrierId) || StringUtils.contains(carrierId, " ") || "undefined".equals(carrierId)){
			throw new InvalidCarrierIdException("Invalid carrier Id used");
		}
		
		SnapshotResponse response = new SnapshotResponse();
		response.setStatus(HttpStatus.OK);
		
		ArrayList<Market> marketIdList = new ArrayList<Market>();
		try {
			marketIdList = snapshotService.getMarketsByCarrierId(carrierId.toUpperCase());
			if(logger.isDebugEnabled() && marketIdList!= null){
				logger.debug("number of markets for " + carrierId + ": " + marketIdList.size());
			}
			
			if(!marketIdList.isEmpty()) {
				marketIdList.sort((Market h1, Market h2) -> h1.getMarketId().compareTo(h2.getMarketId()));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error getting markets for carrierId: " + carrierId);
		}
		logger.info("Number of markets returned: " + marketIdList.size());
		response.setData(marketIdList);
		return response;
		
	}
	
*/
}
