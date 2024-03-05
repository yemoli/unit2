//import org.yaml.snakeyaml.Yaml;
//
//public class SnakeYamlTest {
//    public static void main(String[] args) {
//        unserialize();
//    }
//
//    public static void serialize(){
//        User user = new User();
//        user.setName("DawnT0wn");
//        user.setAge(25);
//        Yaml yaml = new Yaml();
//        String str = yaml.dump(user);
//        System.out.println(str);
//    }
//    public static void unserialize(){
//        String star =
//                "%TAG !  tag:yaml.org,2002:aaaa\n"+
//                "---\n"+
//                        "!User {age: 25, name: DawnT0wn}";
//                ;
//        String str1 = "!User {age: 25, name: DawnT0wn}";
//        Yaml yaml = new Yaml();
//        yaml.load(star);
////        yaml.loadAs(str2, User.class);
//    }
//}
