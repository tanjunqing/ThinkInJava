package LinkedListDemo;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Tan on 15/11/28.
 */
public class LindedListSimple {

    public static void main(String... args) {
        String[] ff = {"3", "4"};
        String[] gg = {"5", "6"};
        String oneStr = "1";
        LinkedList<String> linkedList = Lists.newLinkedList();
        //将制定元素添加到列表的尾部
        linkedList.add(oneStr);
        //在此列表指定位置插入制定元素,此方法等同与offer()
        linkedList.add(1, "2");
        //将指定的collection中的所有元素添加到此列表
        linkedList.addAll(Arrays.asList(ff));
        //在此列表指定位置插入制定collection
        linkedList.addAll(4, Arrays.asList(gg));
        //从此列表中移除所有元素
//        linkedList.clear();
        //如果此列表包含指定元素，则返回 true。
        if (linkedList.contains(oneStr)) {
            System.out.println("已经存在");
        }
        //返回此 LinkedList 的浅表副本。（这些元素本身没有复制。）
        Object object = linkedList.clone();
        //返回以逆向顺序在此双端队列的元素上进行迭代的迭代器
        Iterator<String> iterator = linkedList.descendingIterator();
        //获取但不移除此列表的头（第一个元素）,其实源码里面就是调用getFirst()方法
        String elementstr = linkedList.element();
        //返回此列表中指定位置处的元素
        String getStr = linkedList.get(4);
        //返回此列表的第一个元素
        String getFirstStr = linkedList.getFirst();
        //返回此列表的最后一个元素
        String getListStr = linkedList.getLast();
        //返回此列表中首次出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1。
        int indexOf = linkedList.indexOf(oneStr);
        //返回此列表中最后出现的指定元素的索引，如果此列表中不包含该元素，则返回 -1。
        int lastIndexOf = linkedList.lastIndexOf(oneStr);
        //返回此列表中的元素的列表迭代器(按适当顺序),从列表的制定位置开始
        ListIterator<String> listIterator = linkedList.listIterator(2);
        //顺序提取每个元素
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        //倒序提取每个元素
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        //将指定元素添加到此列表的末尾(最后一个元素) 等同与add()方法
        boolean flag = linkedList.offer("7");
        //在此列表的开头插入指定元素
        flag = linkedList.offerFirst("0");
        //在此列表末尾插入指定的元素
        flag = linkedList.offerLast("8");
        //获取但不移除此列表的头(第一个元素)
        String peekStr = linkedList.peek();
        //获取但不移除此列表的第一个元素，如果此列表为空，则返回null
        String peekFirst = linkedList.peekFirst();
        //获取但不移除此列表的最后一个元素，如果此列表为空，则返回null
        String peekLast = linkedList.peekLast();
        //获取并移除此列表的头（第一个元素）
        String poll = linkedList.poll();
        //获取并移除此列表的第一个元素；如果此列表为空，则返回 null。
        String pollFirst = linkedList.pollFirst();
        //获取并移除此列表的最后一个元素；如果此列表为空，则返回 null。
        String pollLast = linkedList.pollLast();
        //从此列表所表示的堆栈处弹出一个元素。换句话说，移除并返回此列表的第一个元素,此方法等效于 removeFirst()。
        String popStr = linkedList.pop();
        //将元素推入此列表所表示的堆栈。 等同于addFirst
        linkedList.push("0");
        //获取并移除此列表的头（第一个元素）。
        linkedList.remove();
        //移除此列表中指定位置处的元素。将任何后续元素向左移（从索引中减 1）。返回从列表中删除的元素。
        linkedList.remove(2);
        flag = linkedList.remove("4");
        //移除并返回此列表的第一个元素
        String removeFirstStr = linkedList.removeFirst();
        //从此列表中移除第一次出现的指定元素（从头部到尾部遍历列表时）。如果列表不包含该元素，则不作更改。
        flag = linkedList.removeFirstOccurrence("5");
        //移除并返回此列表的最后一个元素。
        String removeLast = linkedList.removeLast();
        //从此列表中移除最后一次出现的指定元素（从头部到尾部遍历列表时）。如果列表不包含该元素，则不作更改。
        flag = linkedList.removeLastOccurrence("5");
        //将此列表中指定位置的元素替换为指定的元素。 返回：以前在指定位置的元素
        String setStr = linkedList.set(0, "10");
        //返回此列表的元素数。
        int sizeCnt = linkedList.size();
        //返回以适当顺序（从第一个元素到最后一个元素）包含此列表中所有元素的数组
        Object[] strings = linkedList.toArray();
        //返回以适当顺序（从第一个元素到最后一个元素）包含此列表中所有元素的数组；
        //返回数组的运行时类型为指定数组的类型。
        //如果指定数组能容纳列表，则在其中返回该列表。
        //否则，分配具有指定数组的运行时类型和此列表大小的新数组。
        String[] str = linkedList.toArray(new String[]{});
    }
}
