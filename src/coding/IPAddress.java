package coding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IPAddress {

    public static void main(String[] args) throws IOException
    {


        String s1 = "25525511135";
        String s2 = "127001";
        String s3 = "1234567891231";


        List<String> ipAddress = ipAddressBuilder(s1);
        String ipList = listToString(ipAddress);

        System.out.println("IP Addresses:  "+ ipList );


    }

    public static List<String> ipAddressBuilder(String s)
    {
        List<String> addresses = new ArrayList<>();
        if(s.length() > 12 || s.length() < 4)
        {
            addresses.add("X");
            return addresses;
        }

        else
            doRestore(addresses, "", s, 0);

        return addresses;
    }

    private static void doRestore(List<String> result, String path, String s, int k)
    {
        if (s.isEmpty() || k == 4) {
            if (s.isEmpty() && k == 4)
                result.add(path.substring(1));
            return;
        }
        for (int i = 1; i <= (s.charAt(0) == '0' ? 1 : 3) && i <= s.length(); i++)
        { // Avoid leading with 0
            String part = s.substring(0, i);
            if (Integer.valueOf(part) <= 255)
                doRestore(result, path + "." + part, s.substring(i), k + 1);
        }
    }

    public static String listToString(List<String> ip)
    {


        return String.join(",", ip);
    }
}
