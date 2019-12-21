import java.util.ArrayList;
public class AppaloosaPriorityQueue
{
private int numMessages;
private ArrayList<ArrayList<Message>> messageQueues;

public AppaloosaPriorityQueue()
{
numMessages = 0;
ArrayList<ArrayList<Message>> messageQueues = new ArrayList<ArrayList<Message>>(10);
}

public int size()
{
return numMessages;
}

public boolean isEmpty()
{
if (numMessages > 0)
return false;
else
return true;
}

public void add(Message msg)
{
int priority = msg.getPriority();
messageQueues.get(priority).add(msg);
}

public Message remove()
{
int k = 0;
int l = 0;
while (l == 0)
{
if (messageQueues.get(k).size() > 0)
l = k;
else
k++;
}
return messageQueues.get(k).get(messageQueues.get(k).size());
}
}