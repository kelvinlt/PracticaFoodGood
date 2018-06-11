package entities;
// Generated 11-jun-2018 22:41:37 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Rate generated by hbm2java
 */
public class Rate  implements java.io.Serializable {


     private Integer idrate;
     private Dish dish;
     private User user;
     private Date date;
     private int mark;
     private String comment;

    public Rate() {
    }

	
    public Rate(Dish dish, User user, Date date, int mark) {
        this.dish = dish;
        this.user = user;
        this.date = date;
        this.mark = mark;
    }
    public Rate(Dish dish, User user, Date date, int mark, String comment) {
       this.dish = dish;
       this.user = user;
       this.date = date;
       this.mark = mark;
       this.comment = comment;
    }
   
    public Integer getIdrate() {
        return this.idrate;
    }
    
    public void setIdrate(Integer idrate) {
        this.idrate = idrate;
    }
    public Dish getDish() {
        return this.dish;
    }
    
    public void setDish(Dish dish) {
        this.dish = dish;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public int getMark() {
        return this.mark;
    }
    
    public void setMark(int mark) {
        this.mark = mark;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }




}


