package sw.com.demo.BSL;

import org.springframework.stereotype.Service;

@Service
public class SearchCriteriaBsl {


    public String SearchServices(String ServiceName) {

        if (ServiceName.toLowerCase().equals("mobile")) {
            return "Etisalat Mobile Service \nOrange Mobile Service \nVodafone Mobile Service \nWE Mobile Service";
        }
        else if (ServiceName.toLowerCase().equals("internet")) {
            return "Etisalat Internet Service \nOrange Internet Service \nVodafone Internet Service \nWE Internet Service";
        }
        else if (ServiceName.toLowerCase().equals("landline")) {
            return "Monthly Landline Service \nQuarter Landline Service";
        }
        else if (ServiceName.toLowerCase().equals("donation")) {
            return "Donation For Schools Service \nDonation For Hospitals Service \nDonation For NGOs Service";
        }
        else {
            return "No Service With That Name";
        }
    }
}
