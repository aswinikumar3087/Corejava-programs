package dateopr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {

        String baseReportedDateTime = "20200128055153";

        if (null == baseReportedDateTime) {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmmss");
            baseReportedDateTime = dateformat.format(new Date());

            System.out.println(baseReportedDateTime);

        }
        System.out.println(changeDateToMtctDateFormat(baseReportedDateTime));
    }

    private static String changeDateToMtctDateFormat(String strDate)  {
        final String methodName = "changeDateToMtctDateFormat";
        String newStrDate = strDate;
        try {
            if (!StringUtil.isNullOrEmpty(newStrDate)) {
                SimpleDateFormat formatter = null;
                if (newStrDate.length() > 12) {
                    formatter = new SimpleDateFormat(GetCommitmentTimeConstants.REPORTED_DATEFORMAT_WITH_SS);
                } else {
                    formatter = new SimpleDateFormat(GetCommitmentTimeConstants.REPORTED_DATEFORMAT_WITHOUT_SS);
                }
                Date dateStr = formatter.parse(newStrDate);
                formatter = new SimpleDateFormat(GetCommitmentTimeConstants.MTCT_DATE_FORMAT);
                newStrDate = formatter.format(dateStr);

            }
        } catch (ParseException e) {
        }

        return newStrDate;
    }
}
