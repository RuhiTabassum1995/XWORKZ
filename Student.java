class Student{
String name;
String Age;
String height;

void playing(){
System.out.println(name+" "+Age+" "+height+"  loves playing cricket and is a member of team scizzlers...!");
}
public static void main(String args[]){
Student ruhi= new Student();
ruhi.name="Ruhi";
ruhi.Age="25";
ruhi.height="5.2";
ruhi.playing();
Student pooja= new Student();
pooja.name="pooja";
pooja.Age="24";
pooja.height="5.3";
pooja.playing();
Student muskan= new Student();
muskan.name="muskan";
muskan.Age="23";
muskan.height="5.4";
muskan.playing();
Student sunita= new Student();
sunita.name="sunita";
sunita.Age="22";
sunita.height="5.4";
sunita.playing();
Student jyoti= new Student();
jyoti.name="jyoti";
jyoti.Age="25";
jyoti.height="5.1";
jyoti.playing();
}
}