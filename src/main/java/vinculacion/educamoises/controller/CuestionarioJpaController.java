/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinculacion.educamoises.controller;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import vinculacion.educamoises.controller.exceptions.NonexistentEntityException;
import vinculacion.educamoises.model.Cuestionario;

/**
 *
 * @author Edinson Ayui
 */
public class CuestionarioJpaController implements Serializable {

    public CuestionarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cuestionario cuestionario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cuestionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cuestionario cuestionario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cuestionario = em.merge(cuestionario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = cuestionario.getId();
                if (findCuestionario(id) == null) {
                    throw new NonexistentEntityException("The cuestionario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cuestionario cuestionario;
            try {
                cuestionario = em.getReference(Cuestionario.class, id);
                cuestionario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cuestionario with id " + id + " no longer exists.", enfe);
            }
            em.remove(cuestionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cuestionario> findCuestionarioEntities() {
        return findCuestionarioEntities(true, -1, -1);
    }

    public List<Cuestionario> findCuestionarioEntities(int maxResults, int firstResult) {
        return findCuestionarioEntities(false, maxResults, firstResult);
    }

    private List<Cuestionario> findCuestionarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cuestionario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cuestionario findCuestionario(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cuestionario.class, id);
        } finally {
            em.close();
        }
    }

    public int getCuestionarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cuestionario> rt = cq.from(Cuestionario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
