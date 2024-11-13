/*
        Static type language
         no=12;
         name="Vimal"

        datatype : type of data.
        category of data type
        1)Premetive Data type or Inbuilt Data type or Primary Data type
        2)Derived Data type
        3)Abstract Data type

        1) Premetive Data type
                                   2 byte = 16  bits


keyword                       use                           byte                       range
boolean                    true/false                    jvm                            jvm
char                    character,symbol                    2                           -32768 to 32767
byte                    numeric value                       1                              -128 to 127
int                     numeric value                         4                              huge value
long                    numeric value                         8                             huge value
float                   decimal value                        8                              huge value
double                 decimal value                        16                           very huge



variable : is a name of memory location in which data is being stored.

naming rule of variable
1)first character must be alphabet or underscore
2)symbol , space and keyword are not allowed.


 */


public class DataTypeDemo {

    public static void main(String[] args)
    {
            boolean b=true;  // initialization of variable
            char c='c';
            byte y;      // declaration of variable
            int no=3;
            float fl=343434.34f;
            double d=343434343434.343434;

         y=23;
         no=y;   /// implecit type conversion.
         y=(byte)no;   // explicit type conversion.

        System.out.println("Boolean b:"+b);
        System.out.println("Character c:"+c);
        System.out.println("Byte y:"+y);
        System.out.println("Integer no:"+no);
        System.out.println("Float fl:"+fl);
        System.out.println("Double d:"+d);





    }
}
