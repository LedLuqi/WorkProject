
public class Boss {

    Loggin_Register logginRegister = new Loggin_Register();

    void createWorker (typeOfWorker type) {

        Worker worker = null;

        switch (type){
            case BRICKLAYER:
                worker = new Bricklayer();
                break;
            case CARPENTER:
                worker = new Carpenter();
                break;
            case TILER:
                worker = new Tiler();
        }

        logginRegister.register(worker);

    }

}
