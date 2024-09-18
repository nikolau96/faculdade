using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Moeda : MonoBehaviour
{
    public AudioClip collectSound;
    public AudioSource audiosource;

    void Start()
    {
        audiosource = GetComponent<AudioSource>();
    }

    void OnTriggerEnter2D(Collider2D other)
    {
        if (other.CompareTag("Player"))
        {
            audiosource.PlayOneShot(collectSound);
            Destroy(gameObject);
        }
    }
}
