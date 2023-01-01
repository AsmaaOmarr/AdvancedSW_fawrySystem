package sw.com.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sw.com.demo.BSL.SearchCriteriaBsl;
@RestController
public class SearchCriteriaController {

    private SearchCriteriaBsl searchCriteriaBsl;

    public SearchCriteriaController(SearchCriteriaBsl searchCriteriaBsl) {
        this.searchCriteriaBsl = searchCriteriaBsl;
    }

    public SearchCriteriaBsl getSearchCriteriaBsl() {
        return searchCriteriaBsl;
    }

    public void setSearchCriteriaBsl(SearchCriteriaBsl searchCriteriaBsl) {
        this.searchCriteriaBsl = searchCriteriaBsl;
    }

    @RequestMapping(value = "/User/SearchServices/{ServiceName}",method = RequestMethod.GET)
    public String SearchServices(@PathVariable("ServiceName") String  ServiceName) {
        return searchCriteriaBsl.SearchServices(ServiceName);
    }
}
