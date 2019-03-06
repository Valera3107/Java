package module_17;

import java.util.Arrays;

public class Collection {
  private static Object[] obj;

  public Collection(Object[] obj) {
    Collection.obj = obj;
  }

  public class Planet implements Iterator {

    private int count = 0;

    @Override
    public boolean hasNext() {
      return count < obj.length;
    }

    @Override
    public Object next() {
      return obj[count++];
    }

    public void printElements() {
      while (hasNext()) {
        System.out.println(next());
      }
    }

    public void checkNumbers() {
      Object[] objects = new Object[obj.length];
      count = 0;
      int i = 0;
      while (hasNext()) {
        if (Integer.parseInt(next().toString()) % 2 != 0) {
          objects[i] = next();
        } else {
          objects[i] = 0;
        }
        i++;
      }
      System.out.print("[");
      Arrays.stream(objects).forEach(e -> {
        if (e != null) {
          System.out.print(e + " ");
        }
      });
      System.out.println("]");
    }
  }

  public class Alien implements Iterator {

    private int count = obj.length;

    @Override
    public boolean hasNext() {
      return count != 0;
    }

    @Override
    public Object next() {
      return obj[count -= 2];
    }

    public void checkNumbers() {
      System.out.print("[");
      while (hasNext()) {
        System.out.print(next() + " ");
      }
      System.out.println("]");
    }
  }

  public Iterator createAnonymous() {
    return new Iterator() {
      private int count = obj.length-1;
      private int counter = 0;

      @Override
      public boolean hasNext() {
        return count != 0;
      }

      @Override
      public Object next() {
        return obj[count--];
      }

      public void checkNumbers() {
        while (hasNext()) {
          if (Integer.parseInt(next().toString()) % 2 != 0 && counter % 3 == 0) {
            System.out.println(next());
          }
          counter++;
        }
      }
    };
  }

  public Iterator function() {
    class LocalClass implements Iterator {

      private int count = 0;

      @Override
      public boolean hasNext() {
        return count < obj.length;
      }

      @Override
      public Object next() {
        return obj[count++];
      }

      @Override
      public void checkNumbers() {
        int counter = 0;
        System.out.print("[");
        while (hasNext()) {
          if (Integer.parseInt(next().toString()) % 2 == 0 && counter % 5 == 0) {
            System.out.print((Integer.parseInt(next().toString()) - 100) + " ");
          }
          counter++;
        }
        System.out.println("]");
      }
    }

    return new LocalClass();
  }


  public static class StaticClass implements Iterator {

    private int count = 0;

    @Override
    public boolean hasNext() {
      return count < obj.length;
    }

    @Override
    public Object next() {
      return count += 2;
    }

    public void checkNumbers() {
      while (hasNext()) {
        if (Integer.parseInt(next().toString()) % 2 == 0) {
          System.out.println(Integer.parseInt(next().toString()) + " -> " + (Integer.parseInt(next().toString()) - 1));
        }
      }
    }
  }

}
