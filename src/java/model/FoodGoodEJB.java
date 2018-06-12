package model;
import entities.Dish;
import entities.Rate;
import entities.Restaurant;
import entities.User;
import exception.FoodGoodExceptions;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@Stateless
public class FoodGoodEJB {
    
    @PersistenceUnit EntityManagerFactory emf;
    
    public void altaUser(User u) throws FoodGoodExceptions{
        EntityManager em = emf.createEntityManager();
        User aux = em.find(User.class, u.getUsername());
        if(aux !=null){
            em.close();
            throw new FoodGoodExceptions("Ya existe un user con el mismo username");
        }
        em.persist(u);
        em.close();
    }
    
    public List<User> listadoUser(){
        return emf.createEntityManager().createNamedQuery("User.findAll").getResultList();
    }
    
    public void altaDish(Dish d) throws FoodGoodExceptions{
        EntityManager em = emf.createEntityManager();
        Dish aux = em.find(Dish.class, d.getName());
        if(aux !=null){
            em.close();
            throw new FoodGoodExceptions("Ya existe un plato con el mismo nombre");
        }
        em.persist(d);
        em.close();
    }
    
    public List<Dish> listadoDish(){
        return emf.createEntityManager().createNamedQuery("Dish.findAll").getResultList();
    }
    
}
