package passc2;

import java.util.*;

enum Event { INCOMING, DONE_CS, DONE_AF, DONE_AB, DONE_SB, DONE_PC }					

class EventBus {
    private Map<Event, List<Workers>> doWork = new HashMap<Event, List<Workers>>();				

    public void register(Workers worker, Event event) {
        if (doWork.get(event) == null){
            List<Workers> newList = new ArrayList<>();
            newList.add(worker);
            doWork.put(event, newList);
          } else {
            doWork.get(event).add(worker);
         }
    }

    public void publish(Event event, Chair chair) {
        if (event == Event.DONE_PC) {
            System.out.println(chair + "\n");
        } else {
            notification(event, chair);
        }
    }

    public void notification(Event event, Chair chair) {
        List<Workers> workers = doWork.get(event);
        for (Workers w : workers){
          if (w.isAvailable()){
                w.operate(chair);
                break;
            }
        }
    }

}
