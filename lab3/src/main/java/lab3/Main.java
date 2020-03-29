// LAB3
package lab2;
import java.util.*; 
import java.io.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello lab3?!");
        //zadanie1
     Set<String> zbiorDni = new TreeSet<>();
     // HashSet zapewnia jedynie unikalno�� element�w
    //Sytuacje, kiedy nie potrzebujemy dost�pu do konkretnego elementu, ale potrzebujemy cz�sto sprawdza�, 
    //czy dany element ju� istnieje w kolekcji .nie mamy �adnej gwarancji co kolejscni elemntow   
        zbiorDni.add("poniedzia�ek");
        zbiorDni.add("wtorek");
        zbiorDni.add("Środa");
        zbiorDni.add("czwartek");
        zbiorDni.add("piątek");
        zbiorDni.add("sobota");
        zbiorDni.add("sobota");
        zbiorDni.add("sobota");
        System.out.println(zbiorDni);  
        
        //TreeSet- przechowuje elementy w postaci drzewa(czerwono czarne,), posortowane, gwarantowana z�o�ono�� przy wstawianiu element�w
        //(mo�e by� to istotne w przypadku du�ych zbior�w) pobranie kolejnego elementu) maj� z�o�ono�� O(log n)
        // Set<String> zbiorDni = new TreeSet<>();
       
         // HasgSet uzyc gdy chcemy tylko sprwdzac czy dany elmenet istenie 
         //TreeSet gwarntuje dodatkwoe sortowanie 
         
      
         //Zadanie 2         
    //przygotuj map�, w kt�rej nazwa przedmiotu mapowana b�dzie na nauczyciela prowadz�cego. 
    //Dodaj kilku nauczycieli do mapy, wyci�gnij z mapy nauczyciela prowadz�cego �programowanie obiektowe�.
    Map<String, Teacher> nauczyciele = new HashMap<>();
    nauczyciele.put("Matematyka", new Teacher("Jan", "Kowalski","jkow@e.com","Matematyka"));
    nauczyciele.put("programowanie obiektowe", new Teacher("Adam", "Kownacki","akow@e.com","programowanie obiektowe"));
   System.out.println(nauczyciele.get("programowanie obiektowe"));
   
    //   przygotuj kilka list zawieraj�cych grupy student�w.
    List<Student> grupa32 = new ArrayList<>();
    grupa32.add(new Student("Kamil", "Kowalski","k@m","32"));
    grupa32.add(new Student("Zenon", "Nowak","z@m","32"));
    List<Student> grupa24 = new ArrayList<>();
    grupa24.add(new Student("Ola", "Kulesza","o@m","24"));
    grupa24.add(new Student("Arek", "Orlewicz","A@m","24"));
    //Przygotuj map�, w kt�rej numer grupy b�dzie mapowany na list� student�w. 
    //Dodaj do niej wcze�niej stworzone listy.Wyci�gnij i wy�wietl list� student�w grupy nr 32.
   Map<Integer, List<Student>> grupy = new HashMap<>();
   grupy.put(32, grupa32);
   grupy.put(24, grupa24);
   System.out.println(grupy.get(32));
   
   //zadanie 3
   
   List<Product> produkty = new ArrayList<>();
   Map<Integer, Product>productyMapId = new HashMap<>();
   
   Map<String,List<Product>> productyMapCat = new HashMap<>();
   List<Product> narzedzia = new ArrayList<>();
   List<Product> slodycze = new ArrayList<>();
   List<Product> oprogramowanie = new ArrayList<>();
   List<Product> inne = new ArrayList<>();
 System.out.println("\n");
        try(BufferedReader in = new BufferedReader(new FileReader("produkty.txt"))) {
         String s = in.readLine();
         while(s!=null) {
             String[] pola = s.split(";");
            Product p= new Product(Integer.parseInt(pola[0]),pola[1],pola[2],Double.parseDouble(pola[3]));
             produkty.add(p);       
             productyMapId.put(Integer.parseInt(pola[0]),p);       
             if(pola[2].equals("oprogramowanie")) {
             oprogramowanie.add(p);
         }   
          else    if(pola[2].equals("narzędzia")) {
             narzedzia.add(p);
         }  
           else   if(pola[2].equals("słodycze")) {
             slodycze.add(p);
         }  
           else   if(pola[2].equals("inne")) {
             inne.add(p);
         }                
              
            s = in.readLine();
         }
         productyMapCat.put("narzędzia",narzedzia);
         productyMapCat.put("slodycze",slodycze);
         productyMapCat.put("oprogramowanie",oprogramowanie);
         productyMapCat.put("inne",inne);

         
     } catch (IOException ex) {
         ex.printStackTrace();
     }  
        
        for(Product p : produkty) {
//        System.out.println(p.getName());
        }

        //szukanie po id
    System.out.println(productyMapId.get(104).getName());

    //suzkanie po kategorii
        for (Product p : productyMapCat.get("narzędzia"))  {
               System.out.println(p.getName()); 
        }
         

   }   
}
