public interface Queue
{
  boolean isEmpty();
  int size();
  void add(Message msg);
  Message remove();
}