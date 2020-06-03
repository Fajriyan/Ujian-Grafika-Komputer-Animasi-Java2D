package UAS_ANIMASI;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;


public class UAS_ANIMASI extends Application{
    
    final static javafx.scene.image.Image WALK_1 = new javafx.scene.image.Image(UAS_ANIMASI.class.getResource("/GAM/1.png").toString());
    final static javafx.scene.image.Image WALK_2 = new javafx.scene.image.Image(UAS_ANIMASI.class.getResource("/GAM/2.png").toString());
    final static javafx.scene.image.Image WALK_3 = new javafx.scene.image.Image(UAS_ANIMASI.class.getResource("/GAM/3.png").toString());
    final static javafx.scene.image.Image WALK_4 = new javafx.scene.image.Image(UAS_ANIMASI.class.getResource("/GAM/4.png").toString());
    final static javafx.scene.image.Image WALK_5 = new javafx.scene.image.Image(UAS_ANIMASI.class.getResource("/GAM/5.png").toString());
    final static javafx.scene.image.Image WALK_6 = new javafx.scene.image.Image(UAS_ANIMASI.class.getResource("/GAM/6.png").toString());
    final static javafx.scene.image.Image WALK_7 = new javafx.scene.image.Image(UAS_ANIMASI.class.getResource("/GAM/7.png").toString());
    final static javafx.scene.image.Image WALK_8 = new javafx.scene.image.Image(UAS_ANIMASI.class.getResource("/GAM/8.png").toString());
    final static javafx.scene.image.Image WALK_9 = new javafx.scene.image.Image(UAS_ANIMASI.class.getResource("/GAM/9.png").toString());
    final static javafx.scene.image.Image BUMI_1 = new javafx.scene.image.Image(UAS_ANIMASI.class.getResource("/GAM/BUMIDUA.png").toString());
    
    private Group jalan;
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        final ImageView walk1 = new ImageView(WALK_1);
        final ImageView walk2 = new ImageView(WALK_2);
        final ImageView walk3 = new ImageView(WALK_3);
        final ImageView walk4 = new ImageView(WALK_4);
        final ImageView walk5 = new ImageView(WALK_5);
        final ImageView walk6 = new ImageView(WALK_6);
        final ImageView walk7 = new ImageView(WALK_7);
        final ImageView walk8 = new ImageView(WALK_8);
        final ImageView walk9 = new ImageView(WALK_9);
        final ImageView background = new ImageView(BUMI_1);
        
        jalan = new Group(walk1);
        
        jalan.setTranslateX(485);
        jalan.setTranslateY(165);
        
        background.setTranslateX(50);
        background.setTranslateY(100);
        
        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);
        
        t.getKeyFrames().add(new KeyFrame(
                javafx.util.Duration.millis(200) ,
                (ActionEvent event)-> {
                    jalan.getChildren().setAll(walk2);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                javafx.util.Duration.millis(300) ,
                (ActionEvent event)-> {
                    jalan.getChildren().setAll(walk3);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                javafx.util.Duration.millis(400) ,
                (ActionEvent event)-> {
                    jalan.getChildren().setAll(walk4);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                javafx.util.Duration.millis(400) ,
                (ActionEvent event)-> {
                    jalan.getChildren().setAll(walk5);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                javafx.util.Duration.millis(400) ,
                (ActionEvent event)-> {
                    jalan.getChildren().setAll(walk6);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                javafx.util.Duration.millis(400) ,
                (ActionEvent event)-> {
                    jalan.getChildren().setAll(walk7);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                javafx.util.Duration.millis(400) ,
                (ActionEvent event)-> {
                    jalan.getChildren().setAll(walk8);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                javafx.util.Duration.millis(400) ,
                (ActionEvent event)-> {
                    jalan.getChildren().setAll(walk9);
                }
        ));
        
        t.play();
        
        //putar 
        ImageView berputar = background;
        Timeline rotate = new Timeline();
        DoubleProperty r = berputar.rotateProperty();
        
        rotate.getKeyFrames().addAll(
                new KeyFrame(new Duration(0), new KeyValue(r, 0)),
                new KeyFrame(new Duration(25000), new KeyValue(r, -360))
        );
        
        rotate.play();
        
        
        
        final Group root = new Group(background, jalan);
        
        primaryStage.setScene(new Scene(root, 1100, 550));
        primaryStage.setTitle("UAS ANIMASI GRAFIKA KOMPUTER [FAJRIYAN NUR - RAMA MAULANA AKBAR ZUBAIDI]");
        primaryStage.show();
        
        
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        Application.launch(args);
        launch(args);
    }
    
}
