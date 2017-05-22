import java.io.IOException;
public class tweets extends EvalFunc<String>{
public string exec(Tuple input) throws IOException{
String s=(String)input.get(0);
String s1="";
if(s.toLowerCase().equals(".*@realdonaldtrump.*")&&(s!=null))
{
s1=s;
}
else
{
s1=null;
}
return s1;
}