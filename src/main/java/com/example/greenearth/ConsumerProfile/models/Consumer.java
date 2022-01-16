package com.example.greenearth.ConsumerProfile.models;//

import javax.persistence.*;//
import java.util.Date;

@Entity
public class Consumer {
        @Id
        private String id;
        private String Name;

        public Consumer() {
        }

        public Consumer(String id, String name) {
                this.id = id;
                Name = name;
        }

        public String getId() {
                return id;
        }

        public String getName() {
                return Name;
        }


}


