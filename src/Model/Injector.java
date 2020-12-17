package Model;

import Controller.*;
import View.*;

import java.util.*;

public class Injector {

    ParkManagement parkManagement;
    UserManagement userManagement;

    public void createParkManagement() {

        parkManagement = new ParkManagement();
        parkManagement.setUserManagement(userManagement);

        Authorization authorization = new Authorization();
        parkManagement.setAuthorization(authorization);

        Budget budget = new Budget(1200, 800, 2001);
        parkManagement.setBudget(budget);

        ParkObject panoramicWheel = new ParkObject("Колесо обозрения",
                "Аттракцион в виде большого вертикально установленного колеса");

        ArrayList<ParkObject> parkObjects = new ArrayList<ParkObject>();
        parkObjects.add(panoramicWheel);
        parkManagement.setParkObjects(parkObjects);

    }

    public void createUserManagement() {

        Visitor visitor = new Visitor("Alex", 1, "1234", new Date(21, Calendar.SEPTEMBER,
                2000), false);

        Subscription subscription = new Subscription(12.1, "Абонемент на посещение всех аттракционов",
                new Date(20, Calendar.OCTOBER, 2020), 12, 5);

        CreditCard creditCard = new CreditCard("Alex", 42552005, 395,
                new Date(1, Calendar.JANUARY, 2022));

        PurchaseManagement purchaseManagement = new PurchaseManagement();

        ParkObject panoramicWheel = new ParkObject("Колесо обозрения",
                "Аттракцион в виде большого вертикально установленного колеса");

        Ticket ticketPanoramicWheel = new Ticket(1, new Date(2, Calendar.DECEMBER, 2020), 1,
                new Date(2, Calendar.DECEMBER, 2020));

        ticketPanoramicWheel.setParkObject(panoramicWheel);

        ArrayList<Location> locations = new ArrayList<Location>();
        Location panoramicWheelLocation = new Location(100, 100);
        locations.add(panoramicWheelLocation);

        Route route = new Route(locations);

        RouteAssistant routeAssistant = new RouteAssistant();

        Recommendation recommendation = new Recommendation();

        VisitorManagement visitorManagement = new VisitorManagement();

        visitorManagement.setPurchaseManagement(purchaseManagement);
        visitorManagement.setRecommendation(recommendation);
        visitorManagement.setCard(creditCard);
        visitorManagement.setRouteAssistant(routeAssistant);

        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        tickets.add(ticketPanoramicWheel);
        visitorManagement.setTickets(tickets);

        ArrayList<Subscription> subscriptions = new ArrayList<Subscription>();
        subscriptions.add(subscription);
        visitorManagement.setSubscriptions(subscriptions);

        ArrayList<Visitor> visitors = new ArrayList<Visitor>();
        visitors.add(visitor);
        visitorManagement.setVisitors(visitors);

        AdministratorManagement administratorManagement = new AdministratorManagement();

        Administrator administrator = new Administrator("Elise", 2, "123");
        administratorManagement.setAdministrator(administrator);

        BudgetManagement budgetManagement = new BudgetManagement();
        administratorManagement.setBudgetManagement(budgetManagement);

        AttractionManagement attractionManagement = new AttractionManagement();
        administratorManagement.setAttractionManagement(attractionManagement);

        RestPlaceManagement restPlaceManagement = new RestPlaceManagement();
        administratorManagement.setRestingPlaceManagement(restPlaceManagement);

        VisitorsManagement visitorsManagement = new VisitorsManagement();
        administratorManagement.setVisitorsManagement(visitorsManagement);

        userManagement = new UserManagement();
        userManagement.setVisitor(visitorManagement);
        userManagement.setAdministrator(administratorManagement);
    }

    public void createUI() {
        MainWindow mainWindow = new MainWindow();

        RatingWindow ratingWindow = new RatingWindow();

        AttractionsWindow attractionsWindow = new AttractionsWindow();
        attractionsWindow.ratingWindow = ratingWindow;

        RestPlacesWindow restPlacesWindow = new RestPlacesWindow();
        restPlacesWindow.ratingWindow = ratingWindow;

        EditProfileWindow editProfileWindow = new EditProfileWindow();
        ProfileWindow profileWindow = new ProfileWindow();
        profileWindow.editProfileWindow = editProfileWindow;

        DiscountsWindow discountsWindow = new DiscountsWindow();

        UserWindow userWindow = new UserWindow();
        userWindow.attractionsWindow = attractionsWindow;
        userWindow.restPlacesWindow = restPlacesWindow;
        userWindow.profileWindow = profileWindow;
        userWindow.discountsWindow = discountsWindow;

        mainWindow.userWindow = userWindow;

        EditVisitorWindow editVisitorWindow = new EditVisitorWindow();

        AdministratorWindow administratorWindow = new AdministratorWindow();
        administratorWindow.editVisitorWindow = editVisitorWindow;
        mainWindow.administratorWindow = administratorWindow;

        editVisitorWindow.show();
    }

}
