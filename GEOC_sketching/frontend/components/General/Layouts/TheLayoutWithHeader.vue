<template>
  <div>
    <v-row v-if="title">
      <v-col>
        <v-row no-gutters>
          <h2 color="primary">
            {{ title }}
          </h2>
        </v-row>
      </v-col>
      <v-col>
        <v-row justify="end" no-gutters>
          <v-icon x-large>
            {{ iconTitle }}
          </v-icon>
        </v-row>
      </v-col>
    </v-row>
    <template v-show="slotInUse('header')">
      <slot name="header" />
    </template>
    <v-card raised outlined class="mx-auto">
      <v-card-subtitle v-show="slotInUse('filter')" class="py-0">
        <slot name="filter" />
      </v-card-subtitle>
      <v-progress-linear v-if="loading" :indeterminate="loading" />
      <v-card-text v-show="slotInUse('body')" class="py-0">
        <v-row v-show="slotInUse('body')">
          <v-col>
            <v-card outlined>
              <slot name="body" />
            </v-card>
          </v-col>
        </v-row>
      </v-card-text>
      <v-row v-show="slotInUse('footer')">
        <v-col>
          <slot name="footer" />
        </v-col>
      </v-row>
    </v-card>
  </div>
</template>
<script>
export default {
  props: {
    loading: {
      type: Boolean,
      default: false
    },
    title: {
      type: String,
      default: ''
    },
    iconTitle: {
      type: String,
      default: ''
    }
  },
  methods: {
    slotInUse (slotName) {
      return !!this.$slots[slotName]
    }
  }
}
</script>
