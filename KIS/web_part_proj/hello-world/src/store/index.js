import Vue from 'vue'
import Vuex from 'vuex'
import axios from "axios";

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        msg: "Pyaternev Alexander YVA-411",
        objectList: [{
            "idPoezd": "60284189",
            "vrsvop": "2022-03-04T15:26:00.000+00:00",
            "disEsr": "654",
            "disPark": "655",
            "disPut": "565",
            "nomPoezd": "03",
            "esrF": "00",
            "pnSost": "2022-03-04T15:26:39.594+00:00",
            "esrN": "00",
            "prGrup": "00",
            "prSoed": "00",
            "kodopP": "00",
            "kategPoezd": 1,
            "esrNapr": "test"
        }]
    },
    getters: {
        getMsg(state) {
            return state.msg
        },
        getObjectList(state) {
            return state.objectList
        }
    },
    mutations: {
        setObjectList(state, objectList) {
            state.objectList = objectList
        }
    },
    actions: {
        async loadObjectsList(context) {
            try {
                const url = '/kis/objects'
                const response = await axios.get(url)
                const results = response.data
                context.commit("setObjectList", results)
            } catch (err) {
                if (err.response) {
                    console.log("Server error: ", err)
                } else if (err.request) {
                    console.log("Network error: ", err)
                } else {
                    console.log("Client error: ", err)
                }
            }
        }

    },
    modules: {}
})
