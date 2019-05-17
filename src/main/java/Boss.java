
public class Boss {

    Loggin_Register logginRegister = new Loggin_Register();

    Worker worker = null;

    void createWorker (typeOfWorker type) {

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
    }

    void register () {
        logginRegister.saveWorkerToDAO(worker);
    }

}
