package WrapperClasses;

import java.math.BigInteger;

public class Homework {


    public int method() {
        int sum = 0;
        String str = "///Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/bin/java -javaagent:/Applications/\" +\n" + "                \"IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=58089:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.\" +\n" + "                \"encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/charsets.\" +\n" + "                \"jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/deploy.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/dnsns.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/jaccess.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/localedata.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/nashorn.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/sunec.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/zipfs.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/javaws.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/jce.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/jfr.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/jfxswt.jar:\" +\n" + "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/jsse.jar:\" +\n" +
                "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/management-agent.jar:\" +\n" +
                "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/plugin.jar:\" +\n" +
                "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/resources.jar:\" +\n" +
                "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/rt.jar:\" +\n" +
                "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/ant-javafx.jar:\" +\n" +
                "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/dt.jar:\" +\n" +
                "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/javafx-mx.jar:\" +\n" +
                "                \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/\" +\n" +
                "                \"JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines\" +\n" +
                "                \"/jdk1.8.0_271.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents\" +\n" +
                "                \"/Home/lib/tools.jar:\" + \"/Users/techtorial/IdeaProjects/TechtorialB7/out/production/TechtorialB7 WrapperClass.StringToPrimitive\\n\";";

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (Character.isDigit(temp)) {
                String temp1 = temp + "";
                sum += Integer.parseInt(temp1);
            }
        }
        return sum;
    }


    public BigInteger numbers() {

        String str = "";

        String value = "///Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/bin/java -javaagent:/Applications/\" +\n" +
                "  \"IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=58089:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.\" +\n" +
                "  \"encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/charsets.\" +\n" +
                " \"jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/deploy.jar:\" +\n" +
                "  \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/dnsns.jar:\" +\n" +
                "   \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/jaccess.jar:\" +\n" +
                "   \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/localedata.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/nashorn.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/sunec.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/zipfs.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/javaws.jar:\" +\n" +
                "  \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/jce.jar:\" +\n" +
                "   \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/jfr.jar:\" +\n" +
                "  \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/jfxswt.jar:\" +\n" +
                "  \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/jsse.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/management-agent.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/plugin.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/resources.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/rt.jar:\" +\n" +
                "  \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/ant-javafx.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/dt.jar:\" +\n" +
                "\"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/javafx-mx.jar:\" +\n" +
                " \"/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/\" +\n" +
                " \"JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines\" +\n" +
                "\"/jdk1.8.0_271.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents\" +\n" +
                "  \"/Home/lib/tools.jar:\" + \"/Users/techtorial/IdeaProjects/TechtorialB7/out/production/TechtorialB7 WrapperClass.StringToPrimitive\\n\";";

        for (int i = 0; i < value.length(); i++) {
            char temp = value.charAt(i);
            if (Character.isDigit(temp)) {
                str += temp + "";
            }
        }
        BigInteger bi = new BigInteger(str);

        return bi;
    }

    public static void main(String[] args) {
        Homework value = new Homework();
        System.out.println(value.method());

        Homework number = new Homework();
        System.out.println(number.numbers());
    }
}
