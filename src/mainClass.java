public class mainClass {
    public static void main(String[] args) {

        Book b = new Book();
        b.setAuthor("test1");
        b.setPages(100);
        System.out.println("The Author is :" + b.getAuthor());
        System.out.println("The page number is :" + b.getPages());


        Software s = new Software();
        s.setProgrammer("Bob is programmer");
        s.setOs("Windows 10");
        s.setPlatform("Linux");
        System.out.println( "The programmer is :" + s.getProgrammer());
        System.out.println("The OS is :"+ s.getOs());
        System.out.println("The platform is :" + s.getPlatform());

        Product p = new Product();
        p.setCode("100");
        p.setDescription("test test");
        p.setPrice(100);
        System.out.println(p.getCode());
        System.out.println(p.getDescription());
        System.out.println(p.getPrice());
        System.out.println((p));
    }

}
