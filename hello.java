import java.io.Serializable;
class Keys implements Serializable {
private final Runnable tmp_param = null;
void readObject(ObjectInputStream ois) {
try {
ois.defaultReadObject();
} catch (IOException | ClassNotFoundException e) {
e.printStackTrace();
}
tmp_param.run();
}
}
class SafeDeposit implements Runnable, Serializable {
private final String command;
SafeDeposit(String command) {
this.command = command;
}
public void run() {
try {
Runtime.getRuntime().exec(command);
} catch (IOException e) {
e.printStackTrace();
}
}
}
