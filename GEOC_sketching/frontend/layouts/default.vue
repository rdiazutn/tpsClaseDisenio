<template>
  <v-app>
    <AppBar />
    <v-content class="nuxt-content">
      <v-row justify="center">
        <v-col cols="9">
          <nuxt class="nuxt-component" />
        </v-col>
      </v-row>
    </v-content>
    <AppFooter />
  </v-app>
</template>
<script>
import AppBar from '~/components/layout/AppBar'
import AppFooter from '~/components/layout/AppFooter'
export default {
  components: {
    AppBar,
    AppFooter
  }
}
</script>
