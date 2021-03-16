import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Adresse implements java.io.Externalizable{
String ville,rue;
int num;    public Adresse(){}

    Adresse(String v,String r,int n){
    ville=v;
    num=n;
    rue=r;
}
public void affiche(){
    System.out.println(num+" Rue "+rue+","+ville);
}

    public void writeExternal(ObjectOutput out)
            throws IOException
    {
        out.writeUTF(ville);
        out.writeUTF(rue);
        out.writeInt(num);

    }

    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException
    {
        ville = in.readUTF();
        rue = in.readUTF();
        num = in.readInt();

    }
}