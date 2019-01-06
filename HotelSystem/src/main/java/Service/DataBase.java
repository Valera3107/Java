package Service;

import Model.Hotel;
import Model.Room;
import Model.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
  public List<Hotel> getHotels(String path) {
    return readHotels(path);
  }

  public List<Room> getRooms(String path) {
    return readRooms(path);
  }

  public List<User> getUsers(String path) {
    return readUsers(path);
  }

  public List<Hotel> readHotels(String fileName) {
    List<Hotel> list = new ArrayList<>();
    try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
      boolean keepReading = true;
      while (keepReading) {
        Hotel h = (Hotel) in.readObject();
        if (h.getId() != -1)
          list.add(h);
        else
          keepReading = false;
      }
    } catch (IOException e) {
      System.out.println("Unable to open file " + fileName + ". Program termination.");
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      System.out.println("Invalid object type.");
      e.printStackTrace();
    }

    return list;
  }

  public List<Room> readRooms(String fileName) {
    List<Room> list = new ArrayList<>();
    try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
      boolean keepReading = true;
      while (keepReading) {
        Room r = (Room) in.readObject();
        if (r.getRoomNumber() != -1)
          list.add(r);
        else
          keepReading = false;
      }
    } catch (IOException e) {
      System.out.println("Unable to open file " + fileName + ". Program termination.");
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      System.out.println("Invalid object type.");
      e.printStackTrace();
    }
    return list;
  }

  public List<User> readUsers(String fileName) {
    List<User> list = new ArrayList<>();
    try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))) {
      boolean keepReading = true;
      while (keepReading) {
        User u = (User) in.readObject();
        if (!"".equals(u.getName()))
          list.add(u);
        else
          keepReading = false;
      }
    } catch (IOException e) {
      System.out.println("Unable to open file " + fileName + ". Program termination.");
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      System.out.println("Invalid object type.");
      e.printStackTrace();
    }
    return list;
  }

  public void writeHotel(List<Hotel> list, String fileName) {
    try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
      out.flush();
      for (Hotel h : list
        ) {
        out.writeObject(h);
      }
      out.writeObject(new Hotel("", "", -1));
    } catch (IOException e) {
      System.out.println("File can not be open! Program terminates!");
    }
  }

  public void writeRoom(List<Room> list, String fileName) {
    try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
      out.flush();
      for (Room m : list
        ) {
        out.writeObject(m);
      }
      out.writeObject(new Room(-1, -1, ""));
    } catch (IOException e) {
      System.out.println("File can not be open! Program terminates!");
    }
  }

  public void writeUser(List<User> list, String fileName) {
    try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
      out.flush();
      for (User u : list
        ) {
        out.writeObject(u);
      }
      out.writeObject(new User("", -1));
    } catch (IOException e) {
      System.out.println("File can not be open! Program terminates!");
    }
  }
}
