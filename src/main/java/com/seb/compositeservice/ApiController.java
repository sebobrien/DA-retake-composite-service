package com.seb.compositeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.seb.entities.CompositeEntity;
import com.seb.entities.MovieEntity;

@RestController("/api")
public class ApiController {
	
	
	
	
	

	@Autowired
	LoadBalancerClient loadBalancer;
	
	RestTemplate restTemplate = new RestTemplate();

//	@GetMapping("/title/{title}")
//	public CompositeEntity getCompositeByTitle(@PathVariable(value = "title") String title) {
//		
//		CompositeEntity result = new CompositeEntity();
//			
//		ServiceInstance instance = loadBalancer.choose("movie-service");
//		String uri = String.format("http://%s:%s/movie-service/title/%s", instance.getHost(), instance.getPort(), title);
//
//		MovieEntity response = restTemplate.getForObject(uri, MovieEntity.class);
//		if (response.response && response.getImbdID() != null) {
//			
//			result.setRecommendations(getRecommendations(response.getImbdID()));
//			result.setReviews(getReviews(response.getImbdID()));
//		}
//     	result.setMovie(response);
//     	
//		return result;
//
//	}
//	
	private String getReviews(String imbdID) {
		ServiceInstance instance = loadBalancer.choose("review-service");
		return restTemplate.getForObject(String.format("http://%s:%s/review-service/id/%s", instance.getHost(), instance.getPort(), imbdID), String.class);
	}

	private String getRecommendations(String genres) {
		ServiceInstance instance = loadBalancer.choose("recommendation-service");
		String uri = String.format("http://%s:%s/recommendation-service/genre/%s", instance.getHost(), instance.getPort(), genres.replaceAll(", ", "&"));
		System.out.println(uri);
		return restTemplate.getForObject(uri, String.class);
	}

	@GetMapping("/mock")
	public CompositeEntity getCompositeMock() {
		
	
		CompositeEntity result = new CompositeEntity();
		RestTemplate restTemplate = new RestTemplate();	
				
		ServiceInstance instance = loadBalancer.choose("movie-service");
				
		String uri = String.format("http://%s:%s/movie-service/title/%s", instance.getHost(), instance.getPort(), "children+of+men");
			
     	result.setMovie(restTemplate.getForObject(uri, MovieEntity.class) ); 
    	
     	result.setRecommendations(getRecommendations(result.getMovie().getGenre()));
    	
		result.setReviews(getReviews("tt0206634"));
		
   		return result;}
	
	
	

	
	
	
		
		
	
		
		
		

}
