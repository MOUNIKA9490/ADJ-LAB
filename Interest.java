package exp3;

public interface Interest {

	float simple(float p, float t, float r) throws RemoteException;

	float compound(float p, float t, float r, float n) throws RemoteException;

}
