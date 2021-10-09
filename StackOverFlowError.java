class StackOverFlowError{
static void fun(int x)
{

if (x == 1){
return;
}
       
x = 8;
fun(x);
}
public static void main(String []args){

int x = 6;
fun(x);
}
}