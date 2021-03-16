import java.io.*;

public class Etudiant extends Personne implements Externalizable {
    public int numinscrit;
  public Etudiant(String n,String P,int t,int num,String v,String r,int nu,int numcompte,int montant){
      super(n,P,t,v,r,nu,numcompte,montant);
      numinscrit=num;
  }
    public Etudiant(){}
    public void writeExternal(ObjectOutput out)
            throws IOException
    {
        super.writeExternal(out);
        out.writeObject(numinscrit);

    }

    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException
    {
        super.readExternal(in);
        numinscrit = (int)in.readInt();
    }

}
