<template>
  <v-footer
    padless
    class="border-top-primary"
  >
    <v-card
      class="flex"
      flat
      tile
      no-gutters
    >
      <v-card-title class="footer-icons">
        <v-row justify="center" align="center">
          <v-col
            v-for="icon in icons"
            :key="icon.name"
            class="mx-4"
            icon
            cols="3"
          >
            <img class="footer-img" :src="icon.src">
          </v-col>
        </v-row>
      </v-card-title>
    </v-card>
  </v-footer>
</template>
<style scoped>
.footer-icons{
  background: white;
}
.footer-img{
  max-height: 40px;
}
</style>
<script>
export default {
  computed: {
    icons () {
      return [
        {
          name: 'UTN',
          src: `${this.$router.options.base}/logo-utn.png`
        }
      ]
    }
  }
}
</script>
