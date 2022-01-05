package Observer;

public interface Church {

    void registerParishioner(Parishioner pashioner);
    void removeParishioner(Parishioner pashioner);
    void notifyParishioners();

}
