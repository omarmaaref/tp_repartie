import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class CompteBancaire implements java.io.Externalizable {
    int NumCompte;
    int Montant;
    public CompteBancaire(){}
    public CompteBancaire(int n,int m){
       NumCompte=n;
       Montant=m;
    }
    public void writeExternal(ObjectOutput out)
            throws IOException
    {
        out.writeInt(NumCompte);
        out.writeInt(Montant);

    }

    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException
    {
        NumCompte = (int)in.readInt();
        Montant = (int)in.readInt();

    }

}
