<template>
  <v-tooltip bottom>
    <template v-slot:activator="{ on }">
      <v-btn
        v-bind="$attrs"
        medium
        depressed
        text
        :disabled="loading"
        :loading="loading"
        v-on="on"
        @click="clicked($event)"
      >
        <v-icon v-if="iconName" :x-large="iconXLarge" :color="iconColor">
          {{ iconName }}
        </v-icon>
      </v-btn>
    </template>
    <span>{{ title }}</span>
  </v-tooltip>
</template>
<script>
export default {
  props: {
    title: {
      type: String,
      default: ''
    },
    iconName: {
      type: String,
      default: null
    },
    btnColor: {
      type: String,
      default: null
    },
    iconColor: {
      type: String,
      default: null
    },
    loading: {
      type: Boolean,
      default: false
    },
    iconXLarge: {
      type: Boolean,
      default: false
    }
  },
  data () {
    return {
      dialog: false
    }
  },
  methods: {
    clicked (ev) {
      this.$emit('click', ev)
    }
  }
}
</script>
