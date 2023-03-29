import java.lang.Math;

public class Challenge{
    public static void main(String arg[])
    {
        double[] sales2021={100.0,100.0,75.0};
        double[] sales2022={120.0,110.0,100.0};
        //calculating mean of each years of sales data
        double mean2021=calculatemean(sales2021);
        double mean2022=calculatemean(sales2022);
        //calculating variance of each years of sales data
        double var2021=calculatevar(sales2021,mean2021);
        double var2022=calculatevar(sales2022,mean2022);
        //calculating variancepct
        double variancepct=(var2022-var2021)/var2021*100.0;
        //print result
        System.out.printf("2021 variance:%2f\n",var2021);
        System.out.printf("2022 variance:%2f\n",var2022);
        System.out.printf("variance pct:%2f%%\n",variancepct);

    } 
    
    public static double calculatemean(double[] data)
    {
        double sum=0.0;
        for(int i=0;i<data.length;i++)
        {
            sum=sum+data[i];
        }
        return sum/data.length;
    }
    public static  double calculatevar(double[] data,double mean){
    double square=0.0;
      
        for(int i=0;i<data.length;i++){
        square+=Math.pow(data[i]-mean,2);
    }
    return Math.sqrt(square/(data.length-1));
}
}
