package Controller;

import Model.*;

import java.util.ArrayList;


public class VisitorManagement {

    public ArrayList<Visitor> visitors;
    public ArrayList<Ticket> tickets;
    public ArrayList<Subscription> subscriptions;
    public CreditCard card;
    public RouteAssistant routeAssistant;
    public PurchaseManagement purchaseManagement;
    public  Recommendation recommendation;

    public VisitorManagement() {
    }

    public VisitorManagement(ArrayList<Visitor> visitors, ArrayList<Ticket> tickets, ArrayList<Subscription> subscriptions, CreditCard card,
                             RouteAssistant routeAssistant, PurchaseManagement purchaseManagement, Recommendation recommendation) {
        this.visitors = visitors;
        this.tickets = tickets;
        this.subscriptions = subscriptions;
        this.card = card;
        this.routeAssistant = routeAssistant;
        this.purchaseManagement = purchaseManagement;
        this.recommendation = recommendation;
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public void setVisitors(ArrayList<Visitor> visitors) {
        this.visitors = visitors;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public ArrayList<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(ArrayList<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public RouteAssistant getRouteAssistant() {
        return routeAssistant;
    }

    public void setRouteAssistant(RouteAssistant routeAssistant) {
        this.routeAssistant = routeAssistant;
    }

    public PurchaseManagement getPurchaseManagement() {
        return purchaseManagement;
    }

    public void setPurchaseManagement(PurchaseManagement purchaseManagement) {
        this.purchaseManagement = purchaseManagement;
    }

    public Recommendation getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    public void editProfile() {

    }

    public void exit() {

    }

}
