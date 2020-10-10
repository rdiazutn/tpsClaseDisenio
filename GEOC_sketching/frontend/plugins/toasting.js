import Vue from 'vue'
import Toasted from 'vue-toasted'
Vue.use(Toasted)
Vue.mixin({
  methods: {
    toastError (msg) {
      this.$toasted.show('Error: ' + msg, {
        theme: 'bubble',
        position: 'top-center',
        duration: 5000,
        icon: 'alert',
        iconPack: 'mdi'
      })
    },
    toastNotification (msg) {
      this.$toasted.show('Info: ' + msg, {
        theme: 'toasted-ok',
        position: 'top-center',
        duration: 5000,
        icon: 'information-outline',
        iconPack: 'mdi'
      })
    }
  }
})
