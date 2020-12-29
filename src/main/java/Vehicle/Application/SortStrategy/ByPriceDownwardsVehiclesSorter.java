package Vehicle.Application.SortStrategy;

import Vehicle.Application.ReportBuilder.VehiclesReportManager;

import java.util.*;

public class ByPriceDownwardsVehiclesSorter implements VehiclesSortStrategy{

    @Override
    public List<String> sort(List<String> pricesDetails, VehiclesReportManager manager) {
        int i, j, max_idx;

        for (i = 1; i < pricesDetails.size(); i++) {
            max_idx = i-1;
            var max_price =Double.parseDouble(pricesDetails.get(max_idx).split("\\|")[0]);
            for (j = i; j < pricesDetails.size(); j++){
                var j_price = Double.parseDouble(pricesDetails.get(j).split("\\|")[0]);

                if(j_price > max_price){
                    max_price = j_price;
                    max_idx = j;
                }
            }
            var old = pricesDetails.get(max_idx);
            pricesDetails.set(max_idx, pricesDetails.get(i-1));
            pricesDetails.set(i-1, old);
        }
        return pricesDetails;
    }
}
