package model;

public enum TournamentMode {
    KNOCK_OUT {
        @Override
        public String toString() {
            return "K.O. Tournament";
        }
    },
    SWISS {
        @Override
        public String toString() {
            return "Swiss Tournament";
        }
    },
    ROUND_ROBIN {
        @Override
        public String toString() {
            return "Round Robin";
        }
    }, DOUBLE_ROUND_ROBIN {
        @Override
        public String toString() {
            return "Double Round Robin";
        }
    };
}
